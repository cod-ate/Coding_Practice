void main()
{
    String[] emails= {"a@x.com", "b@x.com", "a@x.com", "c@x.com", "d@x.com", "a@x.com"};
    HashSet<String> set= new HashSet<>();
    Collections.addAll(set,emails);
    System.out.println(set);
    System.out.println(set.size());
}