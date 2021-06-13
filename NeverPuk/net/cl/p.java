package net.cl;

import java.util.function.Function;
import net.xn;
import net.cl.b;
import net.cl.c;
import net.cl.e;
import net.cl.l;
import net.cl.n;
import net.cl.r;
import net.cl.s;

public enum p {
   MOVEMENT("movement", net.cl.z::<init>),
   FIND_TREE("find_tree", n::<init>),
   PUNCH_TREE("punch_tree", b::<init>),
   OPEN_INVENTORY("open_inventory", l::<init>),
   CRAFT_PLANKS("craft_planks", s::<init>),
   NONE("none", c::<init>);

   private final String f;
   private final Function Z;

   private p(String var3, Function var4) {
      this.f = var3;
      this.Z = var4;
   }

   public r r(e var1) {
      return (r)this.Z.apply(var1);
   }

   public String I() {
      return this.f;
   }

   public static p e(String var0) {
      e.j();
      p[] var2 = values();
      int var3 = var2.length;
      int var4 = 0;
      if(var4 < var3) {
         p var5 = var2[var4];
         if(var5.f.equals(var0)) {
            return var5;
         }

         ++var4;
      }

      return NONE;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
