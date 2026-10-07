/*
Write a function that takes an array of n API request URLs and returns their
corresponding extracted resource chains sorted in a specific order. Each URL
starts with a base domain (e.g., [https://api.example.com/](https://api.example.com/))
followed by a sequence of resources and their IDs
(for example, .../resource1/id1/resource2/id2). First, extract the combined
resource chain for each URL by stripping away the base domain and all the IDs
(so the previous example becomes resource1/resource2, which has a depth of 2 levels).
Finally, sort these extracted resource chains primarily by their path depth
in ascending order (1-level resources, then 2-level, etc.), and secondarily in
standard alphabetical (lexicographical) order for chains that have the exact
same depth (note: lexicographical sorting means resource1 comes before resource10,
which comes before resource2).
*/

void main()
{
    List<String> apis= Arrays.asList("https://api.example.com/users/123",
                                     "https://api.example.com/users/123/orders/456",
                                     "https://api.example.com/products/10",
                                     "https://api.example.com/users/123/orders/456/items/789");

    List<Resource> resources= new ArrayList<>();

    for(String url: apis)
    {
        String path= url.substring("https://api.example.com/".length());

        String[] parts= path.split("/");
        StringBuilder sb= new StringBuilder();

        for(int i=0; i<parts.length; i+=2)
        {
            if(!sb.isEmpty())
                sb.append("/");
            sb.append(parts[i]);
        }

        int depth= parts.length/2;

        resources.add(new Resource(depth, sb.toString()));
    }

    // most complicated part of this code
    resources.sort(Comparator.comparingInt((Resource r) -> r.depth)
            .thenComparing((Resource r) -> r.chain));

    for(Resource r: resources)
        System.out.println(r.chain);
}
class Resource
{
    int depth; String chain;
    Resource(int depth, String chain)
    {
        this.depth= depth;
        this.chain= chain;
    }
}
