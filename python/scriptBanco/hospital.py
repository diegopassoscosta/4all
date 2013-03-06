#coding: utf-8
#Script para povoacao de informacoes em bancos de dados.
import random
import string


hospital = ['sto Antonio', 'Sao Rafael', 'Militar', 'Comunitario', 'Angola Internacional', 'Moxico', 'Luena', 'sta Catarina', 'sta Angela'
,'Vila da Saude', 'Saude para Todos', 'Saude e Voce', 'Luanda', 'Bie', 'Dundo', 'Cunene', 'Benguela', 'Monte Velmiro', 'sta Cassia', 'Viver Bem'
,'Saude para Si', 'Saude para Ti', 'Saude', 'Viva a Saude', 'Angolano', 'Vida', 'Vida para Todos', 'Vida e Saude']


nome = ['Alan', 'Carlos', 'Janete', 'Amandio', 'Bernarda', 'Gregorio', 'Lucas', 'Matheus', 'Rogerio', 'Catarina', 'João', 'Benedito', 'Roberta', 'Roberto',
	'Rafael', 'Raphael', 'Rafaela', 'Raphaela', 'Carmen', 'Augusto', 'Augusta', 'Juno', 'Fabio', 'Fabiana', 'Daniel', 'Diego', 'Zunara', 'Claudioberto', 'Jessica','Sophia']

sobrenome =['Jacinto','Rodigues','Ramirez','Santos','Barros','Reis','Galvão','Silva','Sousa','Souza','Passos','Costa','Lima','Teixeira','Camara','NGongo','Tenario','Tamirez',
	'Tamara','Maliel','Sandre','Sodre','Cunha','Maciel','Patolio','Pastine','Panelli','Junior','Paiva','Vianna']

aniversario = ['20-03-1982','10-04-1984','20-04-1992','05-12-1995','01-01-1998','20-12-1998','17-07-1996','11-09-1998','29-10-1992','08-12-1992',
	'10-03-1990','21-02-1983','07-03-1982','12-08-1982','13-11-1987','20-12-1986']

rg = ['12352765', '92742364', '12314441', '12432575','457534','3547357','3457222','123965','9675967','5467466',
	'678067888','7806780000','87067806780','0860','2357257','23463246','324677','2575472457','345633336','34563456',
	'9238751396590','37856128','092385555','806780678','3262363','58258268','26969292','9123865','0928357','9312805']

prefixo = ['Rua', 'Av'] 

local = ['Alameida das Espatodias', 'Alcemar Coutinho', 'Rafael Santos', 'Junqueira Roberto', 'Avenida Edceu Alois Menezes' , 
'Daniel Salazar','Diogo Rodigues', 'Escritor Valadares', 'Janete Quadros', 'Aliceu, Batista', 'Janerio Chaves', 'Kiko Madruga']

nacionalidade = ['USA', 'Brasileiro', 'Angolano', 'Chines', 'Japones', 'Mexicano', 'Italiano', 'Frances', 'Espanhol', 'Russo', 'Alemao']

especialidade = ['Cardiologista','Oncologista','Reumatologista','Pediatra','Psiquiatra','Cirurgiao Plastico']

cargo = ['Gerente','Consultor','Programador','Analista de Sistemas','Contador','Estatistico','Matematico']

salario = [3000, 4000, 1000, 2000, 800, 1700, 3000, 6000]

processo = ['A','B','C','D','E']

casado = [True, False]
#AUTOMATIZAR
f = open('/home/diegopassoscosta/script_hospital.txt','w')
i = 0;
while i < len(hospital):
	random.shuffle(aniversario)
	random.shuffle(prefixo)
	random.shuffle(local)
	random.shuffle(nome)
	random.shuffle(sobrenome)
	f.write('INSERT INTO hospital (hospital_codigo,'+
		'hospital_nome,'+
		'hospital_aniversario,'+
		'hospital_endereco,'+
		'hospital_telefone,'+
		'hospital_diretor,'+
		'hospital_qtd_leito,'+
		'hospital_qtd_funcionario)\n'+
		'VALUES ('+str(i)+''+
		', '+'"' + 'Hospital ' + str(hospital[i])+'"'+
		', '+str(aniversario[1])+''+
		', '+'"'+str(prefixo[1])+' '+str(local[1])+' n '+str(random.randint(1,90))+'"'+
		', '+'"' +str(random.randint(800,999))+str(random.randint(000,999))+str(random.randint(000,999))+'"' +
		', '+'"' +'Dr(a) ' + str(nome[1]) +' '+str(sobrenome[1])+'"'+ 
		', '+str(random.randint(30,100))+''+
		', '+str(random.randint(20, 110))+''+
		');'+
		'\n\n')
	i = i + 1

f.close()
print "end"
