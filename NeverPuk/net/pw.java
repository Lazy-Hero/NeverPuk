package net;

import com.sun.jna.Callback;
import com.sun.jna.s;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import net.pj;
import net.xn;
import net.ne.l;

public class pw extends s {
   private static final List z = Collections.unmodifiableList(Arrays.asList(new String[]{"ready", "disconnected", "errored", "joinGame", "spectateGame", "joinRequest"}));
   public pw.w A;
   public pw.b u;
   public pw.b W;
   public pw.y w;
   public pw.y f;
   public pw.v y;

   public boolean equals(Object var1) {
      boolean var2 = l.d();
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof pw)) {
         return false;
      } else {
         pw var3 = (pw)var1;
         return Objects.equals(this.A, var3.A) && Objects.equals(this.u, var3.u) && Objects.equals(this.W, var3.W) && Objects.equals(this.w, var3.w) && Objects.equals(this.f, var3.f) && Objects.equals(this.y, var3.y);
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.A, this.u, this.W, this.w, this.f, this.y});
   }

   protected List R() {
      return z;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public interface b extends Callback {
      void g(int var1, String var2);
   }

   public interface v extends Callback {
      void Y(pj var1);
   }

   public interface w extends Callback {
      void N(pj var1);
   }

   public interface y extends Callback {
      void u(String var1);
   }
}
