package MixedPractice;

import java.util.ArrayList;
import java.util.List;

public class TodoManager<T> {
   private List<T> tasks = new ArrayList<>();

   public void addTask(T task){
       if (!tasks.contains(task)){
           tasks.add(task);
           System.out.println("✅ Task added: " + task);
       }else {
           System.out.println("⚠️ Task already exists: " + task);

       }
   }

   public void removeTask(T task){
       if (tasks.remove(task)){
           System.out.println("🗑️ Task removed: " + task);
       }
       else {
           System.out.println("❌ Task not found: " + task);
       }
   }

   public void showAll(){

       System.out.println("📋 All tasks:");

       for(T t : tasks){
           System.out.println("- " + t);
       }


   }

}
