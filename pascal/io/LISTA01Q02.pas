{Autor Diego Passos Costa}
program LISTA01Q02;
var 
    anos  : integer;
    meses : integer;
    dias  : integer;
    
    anos_em_dias  : integer;
    meses_em_dias : integer;
    dias_em_dias  : integer;
    
    total_de_dias_de_vida : integer;
    
begin
    anos_em_dias := 0;
	  meses_em_dias := 0;
	  dias_em_dias := 0;
    {coleta das informações}
    writeln('Digite os anos de vida: ');    
    readln(anos);
    writeln('Digite os meses de vida: ');    
    readln(meses);
    writeln('Digite os dias de vida: ');
    readln(dias);    
    
    {calculos}
    anos_em_dias := anos * 365;
    meses_em_dias := meses * 30;
    dias_em_dias := dias;
    total_de_dias_de_vida := anos_em_dias + meses_em_dias + dias_em_dias;
    
    {demonstração dos resultados}
    writeln('Total de dias de vida ', total_de_dias_de_vida);
end. 