package br.com.gustavolaviola.cliente.model

import org.springframework.web.bind.annotation.RestController
import sun.util.calendar.BaseCalendar.Date
import java.util.Calendar
import org.springframework.web.bind.annotation.GetMapping

@RestController
class ClienteController {

	@GetMapping
	fun get()=Cliente(1L,"test",Calendar.getInstance(),"test@test.com")
	
}