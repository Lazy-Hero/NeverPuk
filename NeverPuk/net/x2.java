package net;

import java.util.ArrayList;
import net.mf;
import net.xn;

public class x2 {
   private ArrayList C;
   private int X;
   private float w;
   private int N;

   public x2() {
      this(10, 0.75F);
   }

   public x2(int var1) {
      this(var1, 0.75F);
   }

   public x2(int var1, float var2) {
      this.C = null;
      this.X = 0;
      this.w = 1.0F;
      this.N = 0;
      this.C = new ArrayList(var1);
      this.X = var1;
      this.w = var2;
   }

   public void R(int var1, Object var2) {
      ++this.N;
      this.C.add(var1, var2);
   }

   public boolean h(Object var1) {
      ++this.N;
      return this.C.add(var1);
   }

   public Object z(int var1, Object var2) {
      Object var3 = this.C.set(var1, var2);
      if(var2 != var3) {
         ++this.N;
         --this.N;
      }

      return var3;
   }

   public Object T(int var1) {
      Object var2 = this.C.remove(var1);
      --this.N;
      return var2;
   }

   public void R() {
      this.C.clear();
      this.N = 0;
   }

   public void J() {
      String var1 = mf.O();
      if(this.N <= 0 && this.C.size() <= 0) {
         this.R();
      }

      if(this.C.size() > this.X) {
         float var2 = (float)this.N * 1.0F / (float)this.C.size();
         if(Float.compare(var2, this.w) <= 0) {
            int var3 = 0;
            int var4 = 0;
            if(var4 < this.C.size()) {
               Object var5 = this.C.get(var4);
               if(var5 != null) {
                  ++var3;
               }

               ++var4;
            }

            var4 = this.C.size() - 1;
            if(var4 >= var3) {
               this.C.remove(var4);
               --var4;
            }
         }
      }

   }

   public boolean I(Object var1) {
      return this.C.contains(var1);
   }

   public Object m(int var1) {
      return this.C.get(var1);
   }

   public boolean S() {
      return this.C.isEmpty();
   }

   public int y() {
      return this.C.size();
   }

   public int R() {
      return this.N;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
