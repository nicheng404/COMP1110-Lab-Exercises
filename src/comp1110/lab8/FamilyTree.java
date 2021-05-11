package comp1110.lab8;

public class FamilyTree {
    /**
     * This function accepts an Individual <code>ancestor</code> representing
     * the root (common ancestor) of a family tree
     * and the name of a target individual to find within that family tree,
     * and returns a string representation of all the ancestors of that
     * individual, each separated by the string " born of ".
     * <p>
     * If target name matches the name of <code>ancestor</code>, then only
     * the target name is returned.
     * <p>
     * If the target name is not found within the family tree descended from
     * <code>ancestor</code>, then null is returned.
     * <p>
     * For example, given an Individual homer representing a person named
     * "Homer", who has children named "Lisa" and "Bart":
     * getAncestry(homer, "Lisa") returns "Lisa born of Homer";
     * getAncestry(homer, "Bart") returns "Bart born of Homer"; and
     * getAncestry(homer, "Homer") returns "Homer"; and
     * getAncestry(homer, "Barney") returns null
     * <p>
     * Note: each individual has only one parent in the family tree.
     *
     * @param ancestor   the root (common ancestor) of a family tree
     * @param targetName the name of an individual to find in the family tree
     * @return a String representing the ancestry of the individual named
     * <code>targetName</code>, or null if no such individual is found
     */
    public static String getAncestry(Individual ancestor, String targetName) {
        // FIXME complete this method
        if(ancestor.name.equals(targetName)){
            return targetName;
        }
        if (ancestor.children == null){
            return null;
        }
        if (ancestor.isChild(targetName)) {
            return  " born of " + ancestor.name;
        }else {
            for (Individual child: ancestor.children) {
                String parentName = getAncestry(child, targetName);
                if (parentName != null) {
                    return parentName + " born of " + ancestor.name;
                }
            }
            return null;
        }
    }

    /**
     * This class represents an individual with zero or more children.
     */
    static class Individual {
        public String name;
        /**
         * This individual's immediate descendants.
         * If this individual has no children, this field is null.
         */
        public Individual[] children;

        public Individual(String name, Individual[] children) {
            this.name = name;
            this.children = children;
        }


        public boolean isChild(String targetName){
            if (children == null){
                return false;
            }
            for (Individual member:
                    children) {
                if (member.equals(targetName)){
                    return true;
                }
            }
            return false;
        }

    }
}