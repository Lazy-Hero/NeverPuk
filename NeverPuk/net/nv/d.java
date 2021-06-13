package net.nv;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nv.f;
import net.nv.h;
import net.nv.t;
import net.nv.x;

public class d extends h {
   public String k() {
      return "difficulty";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.difficulty.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      if(var3.length <= 0) {
         throw new x("commands.difficulty.usage", new Object[0]);
      } else {
         net.yv.l var4 = this.y(var3[0]);
         var1.L(var4);
         g(var2, this, "commands.difficulty.success", new Object[]{new net.cb.h(var4.E(), new Object[0])});
      }
   }

   protected net.yv.l y(String var1) throws t {
      String[] var2 = t.Y();
      return !"peaceful".equalsIgnoreCase(var1) && !"p".equalsIgnoreCase(var1)?(!"easy".equalsIgnoreCase(var1) && !"e".equalsIgnoreCase(var1)?(!"normal".equalsIgnoreCase(var1) && !"n".equalsIgnoreCase(var1)?(!"hard".equalsIgnoreCase(var1) && !"h".equalsIgnoreCase(var1)?net.yv.l.w(g(var1, 0, 3)):net.yv.l.HARD):net.yv.l.NORMAL):net.yv.l.EASY):net.yv.l.PEACEFUL;
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?D(var3, new String[]{"peaceful", "easy", "normal", "hard"}):Collections.emptyList();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
