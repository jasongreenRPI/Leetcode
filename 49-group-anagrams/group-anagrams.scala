object Solution {
    def groupAnagrams(strs: Array[String]): List[List[String]] = {
        //jason-greenberg-04
        def buildMap(index: Int, currentMap: Map[String, List[String]]): Map[String,List[String]] = {
            if(index >= strs.length) {
                return currentMap
            }

            val currentString = strs(index)
            val key = currentString.toCharArray.sorted.mkString

            val anagramsFromKey = currentMap.getOrElse(key, List())

            val nextMap = currentMap + (key -> (currentString::anagramsFromKey))

            buildMap(index+1, nextMap)
        }
        // Start the recursion with the first string (index 0) and an empty map
        val finalGroups: Map[String, List[String]] = buildMap(0, Map())

        // The values of the map are the lists of anagrams. Convert them to a List.
        finalGroups.values.toList
    }
}