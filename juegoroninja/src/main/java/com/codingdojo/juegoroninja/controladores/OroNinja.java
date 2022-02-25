package com.codingdojo.juegoroninja.controladores;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class OroNinja {
	ArrayList<String> alertas = new ArrayList<String>();
	
	@RequestMapping(value="/gold",method=RequestMethod.GET)
	public String index(HttpSession session,Model model) {
		
		model.addAttribute("alerta1",alertas);
		
		if(session.getAttribute("monto")==null) {
			//session.setAttribute("money1", 0);
			//session.setAttribute("money2", 0);
			//session.setAttribute("money3", 0);
			//session.setAttribute("money4", 0);
			//session.setAttribute("id", 0);
			session.setAttribute("monto", 0);
			//session.setAttribute("monto1", 0);
			//session.setAttribute("monto2", 0);
			//session.setAttribute("monto3", 0);
			//session.setAttribute("monto4", 0);
			return "index.jsp";
		}
		else {
			
				
		//Integer dinero1 = (Integer) session.getAttribute("money1");
		//System.out.println("dinero1:"+ dinero1);
		//model.addAttribute("dinero1", dinero1);
		
		//Integer dinero2 = (Integer) session.getAttribute("money2");
		//System.out.println("dinero2:"+ dinero2);
		//model.addAttribute("dinero2", dinero2);
		
		//Integer dinero3 = (Integer) session.getAttribute("money3");
		//System.out.println("dinero3:"+ dinero3);
		//model.addAttribute("dinero3", dinero3);
		
		//Integer dinero4 = (Integer) session.getAttribute("money4");
		//System.out.println("dinero4:" + dinero4);
		
		//model.addAttribute("dinero4", dinero4);
		
		//Integer idt = (Integer) session.getAttribute("id");
		//model.addAttribute("idt", idt);
		//suma
		//Integer monto1 =(Integer) session.getAttribute("monto1");
		//Integer monto2 =(Integer) session.getAttribute("monto2");
		//Integer monto3 =(Integer) session.getAttribute("monto3");
		//Integer monto4=(Integer) session.getAttribute("monto4");
		
		//Integer monto=dinero1+dinero2+dinero3+dinero4;
		//monto1+=dinero1;
		//monto2+=dinero2;
		//monto3+=dinero3;
		
		
		
		//if(idt==1) {
			//monto4+=dinero4;
			//session.setAttribute("monto4", monto4);
		//}
		//else {
			//monto4-=dinero4;
			//session.setAttribute("monto4", monto4);
		//}
		//Integer total=dinero1+dinero2+dinero3+monto4;
		//System.out.println("monto:"+ total);
		//session.setAttribute("total", total);
		//Integer total1 = (Integer) session.getAttribute("total");
		Integer monto = (Integer) session.getAttribute("monto");
		if(monto<0) {
			model.addAttribute("total1", monto);
			return "deudores.jsp";
		}
		else {
			model.addAttribute("total1", monto);
			return "index.jsp";
		}
	}
	}
	
	@RequestMapping(value="/farm",method=RequestMethod.POST)
	public String farm(HttpSession session,RedirectAttributes redirectAttributes) {
		//Obteniendo numeros random entre 10 y 20 
		int numero = (int)(Math.random()*11+10);
		System.out.println("numero de farm "+numero);
		//obteniendo el valor de la sesion money1
		Integer monto=(Integer) session.getAttribute("monto");
		//Integer valor1=(Integer) session.getAttribute("money1");
		//agregandole el valor numero
		monto+=numero;
		//actualizando el atributo session1
		session.setAttribute("monto", monto);
		//Obteniendo la fecha y hora 
		String pattern = "MMMM dd yyyy hh:mm a";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		//Mostrando el mensaje flash 
		String mensaje1="You entered a farm and earned "+numero+" gold." +"("+date+").";
		//redirectAttributes.addFlashAttribute("exito1", mensaje1 );
		alertas.add(mensaje1);
		return "redirect:/gold";
	}
	
	@RequestMapping(value="/cave",method=RequestMethod.POST)
	public String cave(HttpSession session,RedirectAttributes redirectAttributes) {
		
		int numero1 = (int)(Math.random()*6+5);
		System.out.println("numero de cave"+numero1);
		Integer monto=(Integer) session.getAttribute("monto");
		//Integer valor2=(Integer) session.getAttribute("money2");
		monto+=numero1;
		session.setAttribute("monto",monto);
		//Obteniendo la fecha y hora 
		String pattern = "MMMM dd yyyy hh:mm a";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		//Mostrando el mensaje flash 
		//redirectAttributes.addFlashAttribute("exito2","You entered a farm and earned "+valor2+" gold." +"("+date+")." );
		String mensaje2="You entered a cave and earned "+numero1+" gold." +"("+date+")." +" \n";
		alertas.add(mensaje2);
		return "redirect:/gold";
	}
	
	@RequestMapping(value="/house",method=RequestMethod.POST)
	public String house(HttpSession session,RedirectAttributes redirectAttributes) {

		int numero2 = (int)(Math.random()*4+2);
		System.out.println("numero de house"+ numero2);
		Integer monto =(Integer) session.getAttribute("monto");
		//Integer valor3=(Integer) session.getAttribute("money3");
		monto+=numero2;
		session.setAttribute("monto",monto);
		//Obteniendo la fecha y hora 
		String pattern = "MMMM dd yyyy hh:mm a";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		//Mostrando el mensaje flash 
		//redirectAttributes.addFlashAttribute("exito3","You entered a farm and earned "+valor3+" gold." +"("+date+")."+"\n" );
		String mensaje3="You entered a cave and earned "+numero2+" gold." +"("+date+")." +" \n";
		alertas.add(mensaje3);
		return "redirect:/gold";
	}
	
	@RequestMapping(value="/casino",method=RequestMethod.POST)
	public String casino(HttpSession session,RedirectAttributes redirectAttributes) {
		
		int numero3 = (int)(Math.random()*51);
		System.out.println("numero de casino"+numero3);
		Integer monto=(Integer) session.getAttribute("monto");
		//Integer valor4=(Integer) session.getAttribute("money4");
		int numero4 = (int)(Math.random()*2);
		
		if(numero4==1) {
			System.out.println("valor de suma casino gana");
			monto+=numero3;
			session.setAttribute("monto",monto);
			
			//session.setAttribute("id",numero4);
			//Obteniendo la fecha y hora 
			String pattern = "MMMM dd yyyy hh:mm a";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			String date = simpleDateFormat.format(new Date());
			//Mostrando el mensaje flash 
			//redirectAttributes.addFlashAttribute("exito4","You entered a farm and earned "+valor4+" gold." +"("+date+")."+"\n" );
			String mensaje4="You entered a cave and earned "+numero3+" gold." +"("+date+")." +" \n";
			alertas.add(mensaje4);
			return "redirect:/gold";
		}
		else {
			System.out.println("valor de suma casino pierde");
			monto-=numero3;
			session.setAttribute("monto",monto);
			//session.setAttribute("id",numero4);
			//Obteniendo la fecha y hora 
			String pattern = "MMMM dd yyyy hh:mm a";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			String date = simpleDateFormat.format(new Date());
			//Mostrando el mensaje flash 
			//redirectAttributes.addFlashAttribute("exito5","You entered a farm and lost "+valor4+" gold.OUCH" +"("+date+")."+"\n" );
			String mensaje5="You entered a cave and lot "+ numero3 +" gold." +"(" + date + ")." +" \n";
			alertas.add(mensaje5);
			return "redirect:/gold";
		}
	}
	
	@RequestMapping(value="/spa",method=RequestMethod.POST)
	public String perder(HttpSession session) {
		int pierde = (int)(Math.random()*16+5);
		System.out.println("pierde 10-20"+pierde);
		Integer monto=(Integer) session.getAttribute("monto");
		monto-=pierde;
		session.setAttribute("monto",monto);
		
		String pattern = "MMMM dd yyyy hh:mm a";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		String mensaje6="You entered a cave and lot "+ pierde +" gold." +"(" + date + ")." +" \n";
		alertas.add(mensaje6);
		return "redirect:/gold";
	}
	@RequestMapping(value="/reset",method=RequestMethod.POST)
	public String reset(HttpSession session) {
		session.setAttribute("monto", 0);
		return "redirect:/gold";
	}
}
