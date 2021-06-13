package net.cg;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import net.cg.a;

public class w implements Runnable {
   private static final w F = new w();
   private final List G = Collections.synchronizedList(Lists.newArrayList());
   private volatile long J;
   private volatile long W;
   private volatile boolean Y;

   private w() {
      Thread var1 = new Thread(this, "File IO Thread");
      var1.setPriority(1);
      var1.start();
   }

   public static w f() {
      return F;
   }

   public void run() {
      while(true) {
         this.O();
      }
   }

   private void O() {
      net.cg.z.z();
      int var2 = 0;
      if(var2 < this.G.size()) {
         a var3 = (a)this.G.get(var2);
         boolean var4 = var3.Y();
         if(!var4) {
            this.G.remove(var2--);
            ++this.W;
         }

         Thread.sleep(this.Y?0L:10L);
         ++var2;
      }

      if(this.G.isEmpty()) {
         Thread.sleep(25L);
      }

   }

   public void z(a var1) {
      if(!this.G.contains(var1)) {
         ++this.J;
         this.G.add(var1);
      }

   }

   public void s() throws InterruptedException {
      this.Y = true;

      while(this.J != this.W) {
         Thread.sleep(10L);
      }

      this.Y = false;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
