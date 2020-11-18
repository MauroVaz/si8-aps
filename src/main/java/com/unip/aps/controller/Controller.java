package com.unip.aps.controller;

import com.unip.aps.entity.PessoaEntity;
import com.unip.aps.dao.PessoaValoresDAO;

public class Controller {
	
	private PessoaValoresDAO p = new PessoaValoresDAO();
	
	public int enviar(PessoaEntity pessoa) {
		try {
		
		String newJson = "{\"uuid\":" + "\"" + pessoa.getUUID()+"\"" +","+"\"papel\":" + pessoa.getPapel()+","   + "\"plastico\":" + pessoa.getPlastico()+"," 
		+   "\"vidro\":" + pessoa.getVidro() + ","   + "\"metal\":" + pessoa.getMetal() +"," + 
				"\"organico\":" + pessoa.getOrganico() + "," +   "\"outros\":" + pessoa.getOutros() +"}";
			
		(new Thread(new AsyncController(newJson))).start();
		p.insertPessoa(pessoa);
		Thread.sleep(300);
		int returno = p.retorno(pessoa.getUUID());
			return returno;
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}
