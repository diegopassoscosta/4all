program menu_principal;

uses crt;

var op,x:byte;
    t:char;
    nome:string;
    listanome:array[1..5] of string;

begin
        //Interface
        op:=0;
        repeat
                case op of
                        0:begin //Implementacao
                                clrscr;
                                gotoxy(30,7);write('======================');
                                gotoxy(30,8);write('|                    |');
                                gotoxy(30,9);write('|  1 - CADASTRO      |');
                                gotoxy(30,10);write('|  2 - CRESCENTE     |');
                                gotoxy(30,11);write('|  3 - DECRESCENTE   |');
                                gotoxy(30,12);write('|  4 - IMPRIMIR      |');
                                gotoxy(30,13);write('|  5 - SAIR          |');
                                gotoxy(30,14);write('|                    |');
                                gotoxy(30,15);write('|ESCOLHA A OPCAO: __ |');
                                gotoxy(30,16);write('|                    |');
                                gotoxy(30,17);write('======================');
                                gotoxy(48,15);read(op);
                        end;
                        1:begin //Implementacao
                                clrscr;
                                gotoxy(30,7);write('======================');
                                gotoxy(30,8);write('|                    |');
                                gotoxy(30,9);write('|      CADASTRO      |');
                                gotoxy(30,10);write('|                    |');
                                gotoxy(30,11);write('|  NOME 1:           |');
                                gotoxy(30,12);write('|  NOME 2:           |');
                                gotoxy(30,13);write('|  NOME 3:           |');
                                gotoxy(30,14);write('|  NOME 4:           |');
                                gotoxy(30,15);write('|  NOME 5:           |');
                                gotoxy(30,16);write('|                    |');
                                gotoxy(30,17);write('======================');
                                while (x<5) do
                                        begin
                                          gotoxy(40+length(nome),11+x);read();
                                          t:=readkey;
                                          if t=#13 then
                                                begin
                                                        inc(x);
                                                        if x<5 then listanome[x+1]:=nome;
                                                        nome:='';
                                                end
                                          else
                                                begin
                                                        nome:=nome+t;
                                                        gotoxy(40,11+x);
                                                        write(nome);
                                                end;

                                        end;
                                op:=0;
                        end
                        else
                                begin
                                        clrscr;
                                        gotoxy(30,13);
                                        write('Opcao invalida!');
                                        readkey;
                                        op:=0;
                                end;
                end;
        until op=5;
end.
