public class StringManipulator{
    public String trimAndConcat(String str1, String str2){
        String trim1 = str1.trim();
        String trim2 = str2.trim();
        String concat = trim1.concat(trim2);
        return concat;
    }
    public Integer getIndexOrNull(String str, char letter){
        int index = str.indexOf(letter);
        return index;
    }
    public Integer getIndexOrNull(String string, String substr){
        int index = string.indexOf(substr);
        return index;
    }
    public String concatSubstring(String str, int start, int end, String str2){
        String substr = str.substring(start, end);
        String concat = substr.concat(str2);
        return concat;
    }
}