object Solution {
    def isPowerOfTwo(n: Int): Boolean = {
        var flag = false;
        for(i <- 0 to 30) {
            val ans: Int = scala.math.pow(2,i).toInt

            if(ans == n) flag = true
        }

        flag
    }
}