package net.u;

import net.ne.l;
import net.u.j;
import net.u.r;
import net.yz.aq;

public class m {
   private j l;
   public m.z v;
   public aq d;
   public r z;
   public l e;

   public m(r var1, aq var2, j var3) {
      this(m.z.BLOCK, var1, var2, var3);
   }

   public m(r var1, aq var2) {
      this(m.z.BLOCK, var1, var2, j.V);
   }

   public m(l var1) {
      this(var1, new r(var1.b, var1.hS, var1.hr));
   }

   public m(m.z var1, r var2, aq var3, j var4) {
      this.v = var1;
      this.l = var4;
      this.d = var3;
      this.z = new r(var2.p, var2.H, var2.a);
   }

   public m(l var1, r var2) {
      this.v = m.z.ENTITY;
      this.e = var1;
      this.z = var2;
   }

   public j j() {
      return this.l;
   }

   public String toString() {
      return "HitResult{type=" + this.v + ", blockpos=" + this.l + ", f=" + this.d + ", pos=" + this.z + ", entity=" + this.e + '}';
   }

   public static enum z {
      MISS,
      BLOCK,
      ENTITY;
   }
}
