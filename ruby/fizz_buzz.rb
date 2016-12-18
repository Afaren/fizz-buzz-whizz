def can_mod_by?(moder, value)
	moder % value == 0
end

def can_mod_by_three?(n)
	can_mod_by?(n, 3)
end

def can_mod_by_five?(n)
	can_mod_by?(n, 5)
end

def fizz_buzz(n)

	(1..n)
	.to_a
	.map do |v| 
		if can_mod_by_three? v and can_mod_by_five? v 
			"FizzBuzz"
		elsif can_mod_by_three? v 
			"Fizz"
		elsif can_mod_by_five? v
			"Buzz"
		else
			v.to_s
		end
	end

end
