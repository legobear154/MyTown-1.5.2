package ee.lutsu.alpha.mc.mytown;

import net.minecraft.command.ICommandSender;

@SuppressWarnings("serial")
public class NoAccessException extends Exception {
    public String node;
    public ICommandSender executor;

    public NoAccessException(ICommandSender executor, String node) {
        this.node = node;
        this.executor = executor;
    }

    @Override
    public String toString() {
        return Formatter.applyColorCodes(Term.ErrCannotAccessCommand.toString());
    }

    /*
     * private String getCustomizedMessage(String def) { String message;
     * String[] perms = node.split("\\|"); int index;
     * 
     * for(String perm : perms){ while ((index = perm.lastIndexOf(".")) != -1) {
     * perm = perm.substring(0, index);
     * 
     * message = ForgePerms.getPermissionsHandler().getOption(executor,
     * "permission-denied-" + perm, null); if (message == null) { continue; }
     * 
     * return message; } }
     * 
     * message = ForgePerms.getPermissionsHandler().getOption(executor,
     * "permission-denied", null); if (message != null) { return message; }
     * 
     * return def; }
     */
}
