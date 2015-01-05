package org.sparkbit.jsonrpc.autogen;

/**
 * DO NOT EDIT THIS FILE!
 * 
 * Generated by Barrister Idl2Java: https://github.com/coopernurse/barrister-java
 * 
 * Generated at: Mon Jan 05 11:54:39 PST 2015
 */
public class JSONRPCStatusResponse implements com.bitmechanic.barrister.BStruct {


    public static class Builder {
        private String _version;
        public Builder version(String version) { this._version = version; return this; }
        private Boolean _testnet;
        public Builder testnet(Boolean testnet) { this._testnet = testnet; return this; }
        private Long _connections;
        public Builder connections(Long connections) { this._connections = connections; return this; }
        private JSONRPCWalletStatus[] _wallets;
        public Builder wallets(JSONRPCWalletStatus[] wallets) { this._wallets = wallets; return this; }
        public JSONRPCStatusResponse build() {
            return new JSONRPCStatusResponse(this._version, this._testnet, this._connections, this._wallets);
        }

        public Builder() { }
        public Builder(JSONRPCStatusResponse obj) {
            this._version = obj.getVersion();
            this._testnet = obj.getTestnet();
            this._connections = obj.getConnections();
            this._wallets = obj.getWallets();
        }
    }

    private JSONRPCWalletStatus[] wallets;
    private Boolean testnet;
    private Long connections;
    private String version;

    public JSONRPCStatusResponse() {
        super();
    }

    public JSONRPCStatusResponse(java.util.Map _map) throws com.bitmechanic.barrister.RpcException {
        this(
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("version"), false),
            (Boolean)com.bitmechanic.barrister.BoolTypeConverter.unmarshal(_map.get("testnet"), false),
            (Long)com.bitmechanic.barrister.IntTypeConverter.unmarshal(_map.get("connections"), false),
            (JSONRPCWalletStatus[])com.bitmechanic.barrister.ArrayTypeConverter.unmarshalList(JSONRPCWalletStatus.class, _map.get("wallets"), false)
        );
    }

    @org.codehaus.jackson.annotate.JsonCreator
    public JSONRPCStatusResponse(
            @org.codehaus.jackson.annotate.JsonProperty("version") String version, 
            @org.codehaus.jackson.annotate.JsonProperty("testnet") Boolean testnet, 
            @org.codehaus.jackson.annotate.JsonProperty("connections") Long connections, 
            @org.codehaus.jackson.annotate.JsonProperty("wallets") JSONRPCWalletStatus[] wallets) {
        super();
        this.version = version;
        this.testnet = testnet;
        this.connections = connections;
        this.wallets = wallets;
    }

    public void setWallets(JSONRPCWalletStatus[] wallets) {
        this.wallets = wallets;
    }

    public JSONRPCWalletStatus[] getWallets() {
        return this.wallets;
    }

    public void setTestnet(Boolean testnet) {
        this.testnet = testnet;
    }

    public Boolean getTestnet() {
        return this.testnet;
    }

    public void setConnections(Long connections) {
        this.connections = connections;
    }

    public Long getConnections() {
        return this.connections;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return this.version;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JSONRPCStatusResponse:");
        sb.append(" wallets=").append(wallets);
        sb.append(" testnet=").append(testnet);
        sb.append(" connections=").append(connections);
        sb.append(" version=").append(version);
        return sb.toString();
    }

    @Override
    public boolean equals(Object _other) {
        if (this == _other) { return true; }
        if (_other == null) { return false; }
        if (!(_other instanceof JSONRPCStatusResponse)) { return false; }
        JSONRPCStatusResponse _o = (JSONRPCStatusResponse)_other;
        if (wallets == null && _o.wallets != null) { return false; }
        else if (wallets != null && !java.util.Arrays.equals(wallets, _o.wallets)) { return false; }
        if (testnet == null && _o.testnet != null) { return false; }
        else if (testnet != null && !testnet.equals(_o.testnet)) { return false; }
        if (connections == null && _o.connections != null) { return false; }
        else if (connections != null && !connections.equals(_o.connections)) { return false; }
        if (version == null && _o.version != null) { return false; }
        else if (version != null && !version.equals(_o.version)) { return false; }
        return true;
    }

    @Override
    public int hashCode() {
        int _hash = 1;
        _hash = _hash * 31 + (wallets == null ? 0 : java.util.Arrays.hashCode(wallets));
        _hash = _hash * 31 + (testnet == null ? 0 : testnet.hashCode());
        _hash = _hash * 31 + (connections == null ? 0 : connections.hashCode());
        _hash = _hash * 31 + (version == null ? 0 : version.hashCode());
        return _hash;
    }
}

