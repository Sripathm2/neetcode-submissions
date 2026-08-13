class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> tab = new HashSet<String>();
        for(String email: emails){
            String local = email.split("@")[0];
            String domain = email.split("@")[1];
            local = local.split("\\+")[0];
            local = local.replaceAll("\\.", "");
            domain = domain.split("\\+")[0];
            System.out.println(local + " " + domain);
            tab.add(local+"@"+domain);
        }
        return tab.size();
    }
}