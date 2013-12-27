program aula1;

uses crt;

var x,y,num,op:integer;
    r:boolean;
    lista:array[1..5] of string;

begin
        clrscr;
        {read(lista);
        gotoxy(50,20);writeln(nome);
        write('Digite um numero: ');
        read(num);}
        for x:=1 to 5 do
                begin
                        write('Digite o nome ',x,': ');
                        readln(lista[x]);
                end;
        readkey;
        for y:=1 to 5 do
                begin
                        gotoxy(25,y);
                        writeln(lista[y],',');
                end;
        {gotoxy(25,10);write('Digite um numero: ');
        gotoxy(25,43);read(num);
        gotoxy(25,12);writeln('Lista de opcoes:');
        gotoxy(25,13);writeln('1 - Pares');
        gotoxy(25,14);writeln('2 - Impares');
        gotoxy(25,15);writeln('3 - Primos');
        gotoxy(25,16);writeln('Digite o que deseja imprimir: ');
        gotoxy(55,16);read(op);
        repeat
                case op of
                  1:if (num mod 2=0) then writeln(num);
                  2:if (num mod 2<>0) then writeln(num);
                  3:begin
                        r:=false;
                        for x:=2 to num-1 do
                           if (num mod x=0) then r:=true;
                        if r=false then writeln(num);
                    end;
                end;
                dec(num);
        until num<=1;}
        readkey;
end.
