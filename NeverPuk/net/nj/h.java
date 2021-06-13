package net.nj;

import com.google.common.collect.Lists;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import net.nj.b;
import net.nj.f;
import net.nj.j;
import net.nj.n;
import net.nj.o;
import net.nj.q;
import net.nj.u;
import net.nj.v;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class h extends q {
   private static final Logger I = LogManager.getLogger();
   private List a = Lists.newArrayList();
   private byte i = 0;

   void J(DataOutput var1) throws IOException {
      if(this.a.isEmpty()) {
         this.i = 0;
      } else {
         this.i = ((q)this.a.get(0)).C();
      }

      var1.writeByte(this.i);
      var1.writeInt(this.a.size());

      for(int var2 = 0; var2 < this.a.size(); ++var2) {
         ((q)this.a.get(var2)).J(var1);
      }

   }

   void n(DataInput var1, int var2, o var3) throws IOException {
      q.V();
      var3.r(296L);
      if(var2 > 512) {
         throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
      } else {
         this.i = var1.readByte();
         int var5 = var1.readInt();
         if(this.i == 0 && var5 > 0) {
            throw new RuntimeException("Missing type on ListTag");
         } else {
            var3.r(32L * (long)var5);
            this.a = Lists.newArrayListWithCapacity(var5);
            int var6 = 0;
            if(var6 < var5) {
               q var7 = q.j(this.i);
               var7.n(var1, var2 + 1, var3);
               this.a.add(var7);
               ++var6;
               net.u.d.h(new net.u.d[2]);
            }

         }
      }
   }

   public byte C() {
      return (byte)9;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder("[");

      for(int var2 = 0; var2 < this.a.size(); ++var2) {
         var1.append(',');
         var1.append(this.a.get(var2));
      }

      return var1.append(']').toString();
   }

   public void m(q var1) {
      if(var1.C() == 0) {
         I.warn("Invalid TagEnd added to ListTag");
      } else {
         if(this.i == 0) {
            this.i = var1.C();
         } else if(this.i != var1.C()) {
            I.warn("Adding mismatching tag types to tag list");
            return;
         }

         this.a.add(var1);
      }

   }

   public void S(int var1, q var2) {
      if(var2.C() == 0) {
         I.warn("Invalid TagEnd added to ListTag");
      } else if(var1 < this.a.size()) {
         if(this.i == 0) {
            this.i = var2.C();
         } else if(this.i != var2.C()) {
            I.warn("Adding mismatching tag types to tag list");
            return;
         }

         this.a.set(var1, var2);
      } else {
         I.warn("index out of bounds to set tag in tag list");
      }

   }

   public q K(int var1) {
      return (q)this.a.remove(var1);
   }

   public boolean N() {
      return this.a.isEmpty();
   }

   public f i(int var1) {
      if(var1 < this.a.size()) {
         q var2 = (q)this.a.get(var1);
         if(var2.C() == 10) {
            return (f)var2;
         }
      }

      return new f();
   }

   public int H(int var1) {
      if(var1 < this.a.size()) {
         q var2 = (q)this.a.get(var1);
         if(var2.C() == 3) {
            return ((u)var2).Q();
         }
      }

      return 0;
   }

   public int[] h(int var1) {
      if(var1 < this.a.size()) {
         q var2 = (q)this.a.get(var1);
         if(var2.C() == 11) {
            return ((n)var2).i();
         }
      }

      return new int[0];
   }

   public double U(int var1) {
      if(var1 < this.a.size()) {
         q var2 = (q)this.a.get(var1);
         if(var2.C() == 6) {
            return ((v)var2).G();
         }
      }

      return 0.0D;
   }

   public float h(int var1) {
      if(var1 < this.a.size()) {
         q var2 = (q)this.a.get(var1);
         if(var2.C() == 5) {
            return ((j)var2).d();
         }
      }

      return 0.0F;
   }

   public String w(int var1) {
      if(var1 < this.a.size()) {
         q var2 = (q)this.a.get(var1);
         return var2.C() == 8?var2.i():var2.toString();
      } else {
         return "";
      }
   }

   public q h(int var1) {
      return (q)(var1 < this.a.size()?(q)this.a.get(var1):new b());
   }

   public int z() {
      return this.a.size();
   }

   public h j() {
      h var1 = new h();
      var1.i = this.i;

      for(q var3 : this.a) {
         q var4 = var3.v();
         var1.a.add(var4);
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if(!super.equals(var1)) {
         return false;
      } else {
         h var2 = (h)var1;
         return this.i == var2.i && Objects.equals(this.a, var2.a);
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.a.hashCode();
   }

   public int F() {
      return this.i;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
