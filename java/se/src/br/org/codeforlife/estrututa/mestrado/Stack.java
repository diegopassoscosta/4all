package br.org.codeforlife.estrututa.mestrado;

import java.util.EmptyStackException;

public class Stack {
	
	private int tam;
	private int vet[];
	private int top;
	
	public Stack(){
		for (int i = 0; i < vet.length; i++) {
			vet[i] = -1;
		}
		top = 0;
		tam = vet.length;
	}
	
	//1 operacao
	public boolean isFull(){
		if (vet.length == top)
			return true;
		else
			return false;
	}

	public boolean isEmpty(){
		if (vet[0] == -1)
			return true;
		else
			return false;
	}

	public boolean push(int x){
		if (!isFull()){
			vet[top] = x;
			++top;
			return true;
		}else
			return false;
		
	}
	
	public int pop() throws MyEmptyStackException{
		int value;
		if (!isEmpty()){
			value = vet[top];
			--top;
		}else
			throw new MyEmptyStackException();
		
		return value;
	}
	
	public void makeEmpty(){
		top = 0;
	}
	
	public int printTop(){
		return vet[top];
	}
	
	public String toString(){
		String result = "";
		for (int i = vet.length; i > 0 ; i--) {
			result += vet[i] + " ";
		}
		return result;
	}
		
}
