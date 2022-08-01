class Solution {
    public String interpret(String command) {
        // base case 
        if(command == null || command.length() == 0){
            return command;
        }
        
        int length = command.length();
        StringBuilder result = new StringBuilder("");
        char[] commandArray = command.toCharArray();
        
        for(int i=0; i<commandArray.length; i++){
            if(Character.isLetter(commandArray[i]) && commandArray[i] == 'G'){
                result.append("G");
            }else if(commandArray[i+1] == ')'){
                result.append("o");
                i++;
            }else{
                result.append("al");
                i+=3;
            }
        }
        
        return result.toString();
    }
}