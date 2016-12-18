require_relative 'fizz_buzz'
require 'test/unit'

class FizzBuzzTest < Test::Unit::TestCase

	def test_fizz_buzz
		assert_equal [], fizz_buzz(0)
		assert_equal ["1"], fizz_buzz(1)
		assert_equal [
			"1",
			"2",
			"Fizz",
			"4",
			"Buzz",
			"Fizz",
			"7",
			"8",
			"Fizz",
			"Buzz",
			"11",
			"Fizz",
			"13",
			"14",
			"FizzBuzz"
		], fizz_buzz(15)
	end



end

