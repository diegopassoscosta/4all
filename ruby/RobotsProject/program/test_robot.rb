require_relative 'robot'

describe "robot walking to left" do
    it "will walk on block" do
      rob = Robot.new
      rob.andaParaDireita
      rob.retornaPosicao.should  == [1,0]
    end
end

#class CompanyTest <Test::Unit
#    def test_nothing # test associations/relationships
#        assert_equal true, true # make sure a company can have multiple contacts
#    end
#end