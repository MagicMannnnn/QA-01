import React, { createContext, useState } from 'react';

// Create the context
export const UsernameContext = createContext();

// Create the provider component
export const UsernameProvider = ({ children }) => {
    const [username, setUsername] = useState('guest');

    return (
        <UsernameContext.Provider value={{ username, setUsername }}>
            {children}
        </UsernameContext.Provider>
    );
};
