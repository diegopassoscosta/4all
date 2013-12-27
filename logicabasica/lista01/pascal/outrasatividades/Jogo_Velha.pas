program jogo_da_velha;

uses crt;

var s:char;
    c,l,con:byte;
    jogo:array[1..3,1..3]of char;

begin
        //Interface
        clrscr;
        gotoxy(28,10);write('|   |');
        gotoxy(28,11);write('|   |');
        gotoxy(25,11);write('-----------');
        gotoxy(28,11);write('|---|');
        gotoxy(28,12);write('|   |');
        gotoxy(25,13);write('-----------');
        gotoxy(28,13);write('|---|');
        gotoxy(28,14);write('|   |');

        //Codigo fonte
        con:=0;
        repeat
                gotoxy(25,16);write('Escolha a Coluna: ');
                gotoxy(43,16);read(c);
                gotoxy(25,17);write('Escolha a linha: ');
                gotoxy(43,17);read(l);
                if con=0 then
                        begin
                                jogo[c,l]:='X';
                                con:=1;
                        end
                else
                        begin
                                jogo[c,l]:='O';
                                con:=0;
                        end;

                case c of
                        1:if l=1 then
                                gotoxy(26,10)
                          else if l=2 then
                                gotoxy(26,12)
                          else if l=3 then
                                gotoxy(26,14);
                        2:if l=1 then
                                gotoxy(30,10)
                          else if l=2 then
                                gotoxy(30,12)
                          else if l=3 then
                                gotoxy(30,14);
                        3:if l=1 then
                                gotoxy(34,10)
                          else if l=2 then
                                gotoxy(34,12)
                          else if l=3 then
                                gotoxy(34,14);
                end;
                write(jogo[c,l]);
                gotoxy(43,16);write(' ');
                gotoxy(43,17);write(' ');
        until con=9;
end.
