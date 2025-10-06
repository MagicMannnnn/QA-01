import React from 'react';
import { UsernameProvider } from './UsernameContext';

const AppContext = ({ children }) => {
    return (
        <UsernameProvider>
                {children}
        </UsernameProvider>
    );
};

export default AppContext;
