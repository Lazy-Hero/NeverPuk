package net.y8;

import com.google.common.collect.Lists;
import java.util.List;
import net.xn;
import net.u.d;
import net.y8.h;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class q {
   private static final Logger u = LogManager.getLogger();
   private final List m;
   private final List Y;
   private int H;
   private int D;
   private final List N;
   private int X;

   public q(q var1) {
      this();

      for(int var2 = 0; var2 < var1.X(); ++var2) {
         this.k(var1.b(var2));
      }

      this.H = var1.H();
   }

   public q() {
      this.m = Lists.newArrayList();
      this.Y = Lists.newArrayList();
      this.D = -1;
      this.N = Lists.newArrayList();
      this.X = -1;
   }

   public void A() {
      this.m.clear();
      this.Y.clear();
      this.D = -1;
      this.N.clear();
      this.X = -1;
      this.H = 0;
   }

   public q k(h var1) {
      if(var1.t() && this.p()) {
         u.warn("VertexFormat error: Trying to add a position VertexFormatElement when one already exists, ignoring.");
         return this;
      } else {
         this.m.add(var1);
         this.Y.add(Integer.valueOf(this.H));
         switch(null.r[var1.P().ordinal()]) {
         case 1:
            this.X = this.H;
            break;
         case 2:
            this.D = this.H;
            break;
         case 3:
            this.N.add(var1.G(), Integer.valueOf(this.H));
         }

         this.H += var1.l();
         return this;
      }
   }

   public boolean y() {
      return this.X >= 0;
   }

   public int m() {
      return this.X;
   }

   public boolean t() {
      return this.D >= 0;
   }

   public int U() {
      return this.D;
   }

   public boolean w(int var1) {
      return this.N.size() - 1 >= var1;
   }

   public int u(int var1) {
      return ((Integer)this.N.get(var1)).intValue();
   }

   public String toString() {
      h.W();
      String var2 = "format: " + this.m.size() + " elements: ";
      int var3 = 0;
      if(var3 < this.m.size()) {
         var2 = var2 + ((h)this.m.get(var3)).toString();
         if(var3 != this.m.size() - 1) {
            var2 = var2 + " ";
         }

         ++var3;
         d.h(new d[5]);
      }

      return var2;
   }

   private boolean p() {
      int var1 = 0;

      for(int var2 = this.m.size(); var1 < var2; ++var1) {
         h var3 = (h)this.m.get(var1);
         if(var3.t()) {
            return true;
         }
      }

      return false;
   }

   public int u() {
      return this.H() / 4;
   }

   public int H() {
      return this.H;
   }

   public List b() {
      return this.m;
   }

   public int X() {
      return this.m.size();
   }

   public h b(int var1) {
      return (h)this.m.get(var1);
   }

   public int t(int var1) {
      return ((Integer)this.Y.get(var1)).intValue();
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(this.getClass() == var1.getClass()) {
         q var2 = (q)var1;
         return this.H != var2.H?false:(!this.m.equals(var2.m)?false:this.Y.equals(var2.Y));
      } else {
         return false;
      }
   }

   public int hashCode() {
      int var1 = this.m.hashCode();
      var1 = 31 * var1 + this.Y.hashCode();
      var1 = 31 * var1 + this.H;
      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
