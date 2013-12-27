program Hotel_Huanda;

uses crt;

var a,q,op:byte;
    hotel:array[1..3,1..5]of string;
    quarto:string;
    en:boolean;

begin
        op:=0;
        repeat
                case op of
                        0:begin
                                //INTERFACE
                                clrscr;
                                gotoxy(25,10);write('===========================');
                                gotoxy(25,11);write('| 1 - INICIAR             |');
                                gotoxy(25,12);write('| 2 - ALUGAR              |');
                                gotoxy(25,13);write('| 3 - ALUGAR PREFERENCIAL |');
                                gotoxy(25,14);write('| 4 - LIBERAR             |');
                                gotoxy(25,15);write('| 5 - LIBERAR PREFERENCIAL|');
                                gotoxy(25,16);write('| 6 - IMPRIMIR LIVRES     |');
                                gotoxy(25,17);write('| 7 - IMPRIMIR OCUPADOS   |');
                                gotoxy(25,18);write('| 8 - IMPRIMIR GERAL      |');
                                gotoxy(25,19);write('| 9 - FINALIZAR           |');
                                gotoxy(25,20);write('|                         |');
                                gotoxy(25,21);write('| Escolha a opcao: __     |');
                                gotoxy(25,22);write('===========================');
                                gotoxy(44,21);read(op);
                        end;
                        1:begin
                                clrscr;
                                for a:=1 to 3 do
                                        for q:=1 to 5 do
                                                hotel[a,q]:='LIVRE';
                                gotoxy(25,15);
                                write('Sistema inicializado com sucesso!');
                                readkey;
                                op:=0;
                        end;
                        2:begin
                                clrscr;
                                en:=false;
                                a:=1;
                                q:=1;
                                while a<=3 do
                                        begin
                                                while q<=5 do
                                                        begin
                                                                if (hotel[a,q]='LIVRE')and(en=false) then
                                                                        begin
                                                                                hotel[a,q]:='OCUPADO';
                                                                                en:=true;
                                                                                gotoxy(25,15);
                                                                                write('Quarto ocupado com sucesso!');
                                                                                readkey;
                                                                                a:=4;
                                                                                q:=6;
                                                                                op:=0;
                                                                        end;
                                                                        inc(q);
                                                        end;
                                                        inc(a);
                                                        if a<=3 then q:=1;
                                        end;
                                        if (en=false)and((a=4)and(q=6)) then
                                                begin
                                                        gotoxy(25,15);
                                                        write('Todos os quartos estao ocupados');
                                                        op:=0;
                                                        readkey;
                                                end;
                        end;
                        3:begin
                                clrscr;
                                repeat
                                        gotoxy(25,15);
                                        write('Digite o Andar: ');
                                        read(a);
                                        if (a>3)or(a=0) then
                                                begin
                                                        gotoxy(25,15);
                                                        clrscr;
                                                        write('Andar inexistente!');
                                                end;
                                until (a>0)and(a<4);
                                clrscr;
                                repeat
                                        gotoxy(25,15);
                                        write('Digite o Quarto: ');
                                        read(q);
                                        if (q>5)or(q=0) then
                                                begin
                                                        gotoxy(25,15);
                                                        clrscr;
                                                        write('Quarto inexistente!');
                                                end;
                                until (q>0)and(q<6);
                                clrscr;
                                gotoxy(25,15);
                                if (hotel[a,q]='LIVRE') then
                                        begin
                                                hotel[a,q]:='OCUPADO';
                                                write('Quarto ocupado com sucesso!');
                                        end
                                else
                                        write('Quarto encontra-se ocupado!');
                                readkey;
                                op:=0;
                        end;
                        4:begin
                                clrscr;
                                en:=false;
                                a:=1;
                                q:=1;
                                while a<=3 do
                                        begin
                                                while q<=5 do
                                                        begin
                                                                if (hotel[a,q]='OCUPADO')and(en=false) then
                                                                        begin
                                                                                hotel[a,q]:='LIVRE';
                                                                                en:=true;
                                                                                gotoxy(25,15);
                                                                                write('Quarto liberado com sucesso!');
                                                                                readkey;
                                                                                a:=4;
                                                                                q:=6;
                                                                                op:=0;
                                                                        end;
                                                                        inc(q);
                                                        end;
                                                        inc(a);
                                                        if a<=3 then q:=1;
                                        end;
                                        if (en=false)and((a=4)and(q=6)) then
                                                begin
                                                        gotoxy(25,15);
                                                        write('Todos os quartos estao liberados');
                                                        op:=0;
                                                        readkey;
                                                end;
                        end;
                        6:begin
                                clrscr;
                                for a:=1 to 3 do
                                        begin
                                                quarto:='';
                                                for q:=1 to 5 do
                                                        if hotel[a,q]='LIVRE' then quarto:=quarto+hotel[a,q]+',';
                                                gotoxy(25,15+a);
                                                write(quarto);
                                        end;
                                readkey;
                                op:=0;
                        end;
                        7:begin
                                clrscr;
                                for a:=1 to 3 do
                                        begin
                                                quarto:='';
                                                for q:=1 to 5 do
                                                        if hotel[a,q]='OCUPADO' then quarto:=quarto+hotel[a,q]+',';
                                                gotoxy(25,15+a);
                                                write(quarto);
                                        end;
                                readkey;
                                op:=0;
                        end;
                        8:begin
                                clrscr;
                                for a:=1 to 3 do
                                        begin
                                                quarto:='';
                                                for q:=1 to 5 do
                                                        quarto:=quarto+hotel[a,q]+',';
                                                gotoxy(25,15+a);
                                                write(quarto);
                                        end;
                                readkey;
                                op:=0;
                        end
                        else
                                begin
                                        clrscr;
                                        gotoxy(25,15);
                                        write('Opcao invalida!');
                                        readkey;
                                        op:=0;
                                end;
               end;
        until op=9;
end.
