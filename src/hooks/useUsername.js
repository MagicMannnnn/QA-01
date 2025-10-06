import { useContext } from 'react';
import { UsernameContext } from '../context/UsernameContext';

// Custom hook to access the username context
const useUsername = () => {
    const context = useContext(UsernameContext);
    if (!context) {
        throw new Error('useUsername must be used within a UsernameProvider');
    }
    return context;
};

export default useUsername;
