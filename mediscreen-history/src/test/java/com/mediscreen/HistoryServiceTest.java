package com.mediscreen;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.mediscreen.repository.*;
import com.mediscreen.entities.History;

@SpringBootTest
@TestPropertySource(locations="classpath:application.properties")
public class HistoryServiceTest {

	@Autowired
	private HistoryRepository historyRepository;
	
	private static History history;
	
	@BeforeAll
	public static void setup() {
		   history = new History("Le patient va bien", "test001");
	}
	
	@Test
	public void addHistoryTest() {
		history = historyRepository.save(history);
		assertEquals("test001", history.getIdPatient());
	}
	
	@Test
	public void allHistoryTest(){
      history = historyRepository.save(history);
	  List<History> listH = historyRepository.findAll();
	  assertTrue(listH.size() >0 );
	}
	
	@Test
	public void updateHistoryTest(){
	  history.setNotes("Le patient est malade"); 
	  history = historyRepository.save(history);
	  assertEquals("Le patient est malade", history.getNotes());
	}
	
	@Test
	public void findHistoryTest(){
	  history = historyRepository.save(history);
	  String id = history.getId();
	  Optional<History> historys = historyRepository.findById(id);
	  assertTrue(historys.isPresent());
	  historyRepository.delete(history);

	}
	
	@Test
	public void deleteHistoryTest(){
	  history = historyRepository.save(history);
	  String id = history.getId();
	  historyRepository.delete(history);
	  Optional<History> history = historyRepository.findById(id);
	  assertFalse(history.isPresent());
	}
	
	
}
