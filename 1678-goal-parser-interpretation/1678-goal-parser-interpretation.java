class Solution {
    public String interpret(String command) {
        if(command == null || command.length() == 0){
            return command;
        }
        
        return command.replace("()","o").replace("(al)","al");
    }
}