require 'test/unit'  
require_relative 'robot'

class RobotWalk < Test::Unit::TestCase  
  def test_walk_on_block_right
      rob = Robot.new
      rob.andaParaDireita
      expected = [1,0]  
      assert_equal(rob.retornaPosicao,expected);  
  end  
end