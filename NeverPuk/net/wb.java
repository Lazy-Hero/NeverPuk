package net;

import net.i8;
import net.xn;
import net.u.d;

public class wb {
   protected String k;
   protected i8 U;

   public wb(String var1, i8 var2) {
      i8.T();
      super();
      this.k = var1;
      this.U = var2;
      switch(null.u[var2.ordinal()]) {
      case 1:
         this.k = "    §7[§6!§7] New §f" + this.k;
      case 2:
         this.k = "    §7[§a+§7] Added §f" + this.k;
      case 3:
         this.k = "    §7[§9*§7] Recoded §f" + this.k;
      case 4:
         this.k = "    §7[§d/§7] Improved §f" + this.k;
      case 5:
         this.k = "    §7[§c-§7] Deleted §f" + this.k;
      case 6:
         this.k = "    §7[§b/§7] Fixed §f" + this.k;
      case 7:
         this.k = "    §7[§9->§7] Moved §f" + this.k;
      case 8:
         this.k = " " + this.k;
      default:
         if(d.y() == null) {
            i8.c(new int[1]);
         }

      }
   }

   public String q() {
      return this.k;
   }

   public i8 w() {
      return this.U;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
