// Group the Word Tiles

void main()
{
    String[] words= {"eat", "tea", "tan", "ate", "nat", "bat"};
    HashMap<String, ArrayList<String>> map= new HashMap<>();

    for(String word: words)
    {
        char[] ch= word.toCharArray();
        Arrays.sort(ch);
        String key= new String(ch);
        if(!map.containsKey(key))
            map.put(key, new ArrayList<>());
        map.get(key).add(word);
    }
    for(ArrayList<String> group: map.values())
        System.out.println(group);
}
