package me.smartstore.group;

public enum GroupType {
    NONE("해당없음"), GENERAL("일반고객"), VIP("우수고객"), VVIP("최우수고객"),
    N("해당없음"), G("일반고객"), V("우수고객"), VV("최우수고객");

    String groupType = "";

    GroupType(String groupType) {
        this.groupType = groupType;
    }

    public GroupType replaceFullName() {
        if (this == N) return NONE;
        else if (this == G) return GENERAL;
        else if (this == V) return VIP;
        else if (this == VV) return VVIP;
        return this;
    }
}
