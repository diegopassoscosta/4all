#coding: utf-8
#Script para povoacao de informacoes em bancos de dados.
import random
import string

nome = ['Alan', 'Carlos', 'Janete', 'Amandio', 'Bernarda', 'Gregorio', 'Lucas', 'Matheus', 'Rogerio', 'Catarina', 'João', 'Benedito', 'Roberta', 'Roberto',
	'Rafael', 'Raphael', 'Rafaela', 'Raphaela', 'Carmen', 'Augusto', 'Augusta', 'Juno', 'Fabio', 'Fabiana', 'Daniel', 'Diego', 'Zunara', 'Claudioberto', 'Jessica','Sophia']

sobrenome =['Jacinto','Rodigues','Ramirez','Santos','Barros','Reis','Galvão','Silva','Sousa','Souza','Passos','Costa','Lima','Teixeira','Camara','NGongo','Tenario','Tamirez',
	'Tamara','Maliel','Sandre','Sodre','Cunha','Maciel','Patolio','Pastine','Panelli','Junior','Paiva','Vianna']

aniversario = ['20-03-1982','10-04-1984','20-04-1992','05-12-1995','01-01-1998','20-12-1998','17-07-1996','11-09-1998','29-10-1992','08-12-1992',
	'10-03-1990','21-02-1983','07-03-1982','12-08-1982','13-11-1987','20-12-1986']


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
f = open('/home/diegopassoscosta/script_medico.txt','w')
i = 0;
while i < len(nome):
	random.shuffle(aniversario)
	random.shuffle(cargo)
	random.shuffle(nome)
	random.shuffle(especialidade)
	random.shuffle(sobrenome)
	random.shuffle(prefixo)
	random.shuffle(local)
	random.shuffle(nacionalidade)
	random.shuffle(salario)
	random.shuffle(processo)
	f.write('INSERT INTO medico (medico_nome,'+
		'medico_sobrenome,'+
		'medico_processo,'+
		'medico_aniversario,'+
		'medico_salario,'+
		'medico_sala,'+
		'medico_especialidade,'+
		'medico_telefone)\n'+
		'VALUES ('+'"'+str(nome[i])+'"'+
		','+'"'+str(sobrenome[i])+'"'+
		', '+'"'+str(i)+str(processo[1])+'-'+str(processo[2])+str(random.randint(0,2000))+'"'+
		', '+str(aniversario[1])+
		', '+str(salario[1])+
		', '+str(i+1)+ #sala
		', '+'"'+str(especialidade[1])+'"'+
		', '+'"'+str(random.randint(900,999))+str(random.randint(000,999))+str(random.randint(000,999))+'"'+
		');'+
		'\n\n')
	i = i + 1

f.close()
print "end"
