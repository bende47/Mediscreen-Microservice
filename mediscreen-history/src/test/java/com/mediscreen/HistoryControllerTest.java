package com.mediscreen;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class HistoryControllerTest {

	@Autowired
	private MockMvc mvc;	
	
	@Test
	public void addHistoryTestC() throws Exception {
		this.mvc.perform(MockMvcRequestBuilders.post("/patHistory/add")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"id\": \"test1\",\"notes\": \"test1\",\"idPatient\": \"test1\"}")
				.accept(MediaType.APPLICATION_JSON))
		        .andDo(MockMvcResultHandlers.print())
		        .andExpect(status().isOk());

	}	
	
	@Test
	public void findHistoryTestC() throws Exception {
		
		this.mvc.perform(MockMvcRequestBuilders.post("/patHistory/add")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"id\": \"test\",\"notes\": \"test\",\"idPatient\": \"test\"}")
				.accept(MediaType.APPLICATION_JSON))
		        .andDo(MockMvcResultHandlers.print())
		        .andExpect(status().isOk());
		
		this.mvc.perform(MockMvcRequestBuilders.get("/patHistory/find/test")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)).andDo(MockMvcResultHandlers.print()).andExpect(status().isOk());

	}
	
	@Test
	public void allHistoryTestC() throws Exception {
		this.mvc.perform(MockMvcRequestBuilders.get("/patHistory/all")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)).andDo(MockMvcResultHandlers.print()).andExpect(status().isOk());

	}
	
	@Test
	public void updateHistoryTestC() throws Exception {
			
		this.mvc.perform(MockMvcRequestBuilders.put("/patHistory/update/test1")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"id\": \"test\",\"notes\": \"test2\",\"idPatient\": \"test\"}")
				.accept(MediaType.APPLICATION_JSON))
		        .andDo(MockMvcResultHandlers.print())
		        .andExpect(status().isOk());
		
		this.mvc.perform(MockMvcRequestBuilders.delete("/patHistory/delete/test")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)).andDo(MockMvcResultHandlers.print()).andExpect(status().isOk());

		this.mvc.perform(MockMvcRequestBuilders.delete("/patHistory/delete/test1")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)).andDo(MockMvcResultHandlers.print()).andExpect(status().isOk());

	}
	
	
	@Test
	public void allHistoryPatientTestC() throws Exception {
			
		this.mvc.perform(MockMvcRequestBuilders.get("/patHistory/allHistoryPatient/test")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)).andDo(MockMvcResultHandlers.print()).andExpect(status().isOk());

	}

}
