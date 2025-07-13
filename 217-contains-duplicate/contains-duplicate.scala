object Solution {
    def containsDuplicate(nums: Array[Int]): Boolean = {
        val seen = scala.collection.mutable.Set[Int]()
        nums.exists(num => !seen.add(num) )
        
    }
}