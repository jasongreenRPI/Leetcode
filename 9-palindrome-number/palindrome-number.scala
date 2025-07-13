object Solution {
    def isPalindrome(x: Int): Boolean = {
       if(x < 0) { return false }

        var xStringified = x.toString

        if(xStringified.length() == 1) { return true }

        var right: Int = xStringified.length() - 1
        var left: Int = 0


        // 12
        // 131

        while(left<right) {
            if(xStringified(left) != xStringified(right)) {
                return false
            }

            left+=1
            right-=1

  
        }

        if(xStringified(left) != xStringified(right)) {
            return false
        }

        return true
    }
}