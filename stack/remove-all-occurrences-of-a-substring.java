class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        int i=0;
        while((i=sb.indexOf(part))!=-1)
        {
            sb.delete(i,i+part.length());
        }
    return sb.toString();
    }
}