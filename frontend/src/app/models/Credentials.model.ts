import { Portofolio } from "./Portofolio.model";

export interface Credentials{
    id?: number;
    username?: string;
    password?: string;
    role?: number;
    portofolio?: Portofolio[];
}