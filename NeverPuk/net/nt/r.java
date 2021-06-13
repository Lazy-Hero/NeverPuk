package net.nt;

public class r extends net.nv.h {
   public String k() {
      return "list";
   }

   public int o() {
      return 0;
   }

   public String K(net.nv.f var1) {
      return "commands.players.usage";
   }

   public void c(net.nx.f var1, net.nv.f var2, String[] var3) throws net.nv.t {
      int var4 = var1.V();
      var2.r(new net.cb.h("commands.players.list", new Object[]{Integer.valueOf(var4), Integer.valueOf(var1.P())}));
      var2.r(new net.cb.l(var1.c().L(var3.length > 0 && "uuids".equalsIgnoreCase(var3[0]))));
      var2.n(net.nv.l.QUERY_RESULT, var4);
   }

   private static net.nv.t a(net.nv.t var0) {
      return var0;
   }
}
