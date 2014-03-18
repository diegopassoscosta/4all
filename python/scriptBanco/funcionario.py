#Autor Diego Passos Costa
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

rg_letra = ['A','B','C','D','E','F','G']

prefixo = ['Rua', 'Av'] 

local = ['Alameida das Espatodias', 'Alcemar Coutinho', 'Rafael Santos', 'Junqueira Roberto', 'Avenida Edceu Alois Menezes' , 
'Daniel Salazar','Diogo Rodigues', 'Escritor Valadares', 'Janete Quadros', 'Aliceu, Batista', 'Janerio Chaves', 'Kiko Madruga']

nacionalidade =['USA', 'Brasileiro', 'Angolano', 'Chines', 'Japones', 'Mexicano', 'Italiano', 'Frances', 'Espanhol', 'Russo', 'Alemao']

cargo = ['Gerente','Consultor','Programador','Analista de Sistemas','Contador','Estatistico','Matematico']

salario = [3000, 4000, 1000, 2000, 800, 1700, 3000, 6000]

casado = [True, False]

f = open('/home/diegopassoscosta/script_funcionario.txt','w')
i = 0;
while i < len(nome):
	random.shuffle(aniversario)
	random.shuffle(cargo)
	random.shuffle(prefixo)
	random.shuffle(rg_letra)
	random.shuffle(local)
	random.shuffle(nacionalidade)
	random.shuffle(casado)
	random.shuffle(salario)
	f.write('INSERT INTO funcionario (funcionario_processo,'+
		'funcionario_nome,'+
		'funcionario_sobrenome,'+
		'funcionario_aniversario,'+
		'funcionario_cargo,'+
		'funcionario_bi,'+
		'funcionario_endereco,'+
		'funcionario_nacionalidade,'+
		'funcionario_salario,'+
		'casado,'+
		'funcionario_telefone)\n'+
		'VALUES ('+str(i)+
		', '+''+'"'+str(nome[i])+'"'+
		', '+''+'"'+str(sobrenome[i])+'"'+
		', '+''+str(aniversario[1])+''+
		', '+''+'"'+str(cargo[1])+'"'+
		', '+'"'+str(i)+ str(rg_letra[1]) + str(random.randint(200,700))+'-'+str(random.randint(400, 900))+str(rg_letra[2])+ str(random.randint(0,2000))+'"'+
		',' +'"'+str(prefixo[1])+' '+str(local[1])+ ' n '+str(random.randint(1,90))+'"' + ',' +''+'"'+str(nacionalidade[1])+'"'+
		','+''+str(salario[1])+', '+str(casado[1])+', '+'"'+str(random.randint(800,999))+str(random.randint(000,999))+str(random.randint(000,999))+'"'+''+
		');'+
		'\n\n')
	i = i + 1

f.close()
print "end"
