class Robot

  def initialize
    @x = 0
    @y = 0
  end

  def andaParaDireita
    @x = @x + 1  
  end
 
  def andaParaEsquerda
    @x = @x - 1  
  end
  
  def andaParaCima
    @y = @y + 1  
  end
  
  def andaParaBaixo
    @y = @y - 1  
  end
  
  def andaParaSudeste
    @x = @x + 1
    @y = @y - 1  
  end
  
  def andaParaSudoeste
    @x = @x - 1
    @y = @y - 1  
  end
  
  def andaParaNoroeste
    @x = @x - 1
    @y = @y + 1  
  end
 
  def andaParaNordeste
    @x = @x + 1
    @y = @y + 1  
  end
  
  def retornaPosicao
    return @x, @y
  end
 
end