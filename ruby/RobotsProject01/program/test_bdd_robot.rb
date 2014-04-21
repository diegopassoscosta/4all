require_relative 'robot'

describe "robot walking to left" do
    it "will walk on block to right" do
      rob = Robot.new
      rob.andaParaDireita
      rob.retornaPosicao.should  == [1,0]
    end
end