program matriz;

uses crt;

var mat:array[1..3,1..4]of string;
    x,y:byte;

begin
        clrscr;
        for x:=1 to 3 do
                for y:=1 to 4 do
                        begin
                                write('Digite a fruta: ');
                                readln(mat[x,y]);
                        end;
        readkey;
        for x:=1 to 3 do
                for y:=1 to 4 do
                        write(mat[x,y],',');
        readkey;
end.
