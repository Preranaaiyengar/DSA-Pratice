/* Here ive tried to implement on how to encode and decode a string do try it out and let me know if there are any other better approaches */

//encode : we return a list , args is list strs

if( strs.size()==0){
   return Character.toString(char(258));
}

String separator = Character.toString(char(257));
StringBuilder sb = new StringBuilder();
for(s:strs){
    sb.append(s);
    sb.append(separator);
}

sb.deleteCharAt(sb.length()-1);
return sb.toString();

//decode: args String s

if(s.equals(Character.toString(char(258)))
   return new ArrayList();

String separator = Character.toString(char(257));

return  Arrays.asList(s.split(separator));
