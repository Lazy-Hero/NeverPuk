package net.z;

import java.io.IOException;
import net.z.g;
import net.z.m;
import net.z.th;
import net.z.tt;
import net.z.tu;

public class ti extends tu {
   public void L() {
      this.m.clear();
      this.m.add(new th(0, q / 2 - 155, V / 4 + 120 + 12, net.c9.b.x("gui.toTitle", new Object[0])));
      this.m.add(new th(1, q / 2 - 155 + 160, V / 4 + 120 + 12, net.c9.b.x("menu.quit", new Object[0])));
   }

   protected void t(m var1) throws IOException {
      boolean var2 = g.C();
      if(var1.g == 0) {
         this.A.s(new tt());
      }

      if(var1.g == 1) {
         this.A.A();
      }

   }

   protected void Q(char var1, int var2) throws IOException {
   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.d(this.O, "Out of memory!", q / 2, V / 4 - 60 + 20, 16777215);
      this.n(this.O, "Minecraft has run out of memory.", q / 2 - 140, V / 4 - 60 + 60 + 0, 10526880);
      this.n(this.O, "This could be caused by a bug in the game or by the", q / 2 - 140, V / 4 - 60 + 60 + 18, 10526880);
      this.n(this.O, "Java Virtual Machine not being allocated enough", q / 2 - 140, V / 4 - 60 + 60 + 27, 10526880);
      this.n(this.O, "memory.", q / 2 - 140, V / 4 - 60 + 60 + 36, 10526880);
      this.n(this.O, "To prevent level corruption, the current game has quit.", q / 2 - 140, V / 4 - 60 + 60 + 54, 10526880);
      this.n(this.O, "We\'ve tried to free up enough memory to let you go back to", q / 2 - 140, V / 4 - 60 + 60 + 63, 10526880);
      this.n(this.O, "the main menu and back to playing, but this may not have worked.", q / 2 - 140, V / 4 - 60 + 60 + 72, 10526880);
      this.n(this.O, "Please restart the game if you see this message again.", q / 2 - 140, V / 4 - 60 + 60 + 81, 10526880);
      super.v(var1, var2, var3);
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
