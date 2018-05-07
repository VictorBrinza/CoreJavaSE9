
package chapter4.exercises.exercise8;

import java.util.ArrayList;


public class Network {
    public class Member{
        private String name;
        private ArrayList<Member> friends;
        
        public Member(String name){
            this.name = name;
            friends = new ArrayList<>();
        }

    }
    private ArrayList<Member> members = new ArrayList<>();
    
    public Member enrol(String name){
            Member newMember = new Member(name);
            members.add(newMember);
            return newMember;
        }
    public static void main(String[] args){
        Network myFace = new Network();
        Network.Member fred = myFace.enrol("Fred");
        
        Class<?> cl = fred.getClass();
        System.out.println("this object is an instance of "+ cl.getCanonicalName());
        System.out.println("this object is an instance of "+ cl.getSimpleName());
        System.out.println("this object is an instance of "+ cl.getTypeName());
        System.out.println("this object is an instance of "+ cl.getName());
        System.out.println("this object is an instance of "+ cl.toString());
        System.out.println("this object is an instance of "+ cl.toGenericString());
      
    }
}
